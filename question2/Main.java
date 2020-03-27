import java.util.Scanner;
import java.util.ArrayList;
import java.net.MalformedURLException;
import java.lang.IllegalArgumentException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;

public class Main {

    static String getProductName(Document doc) {
        // Test for layout 1
        Elements nameHTML = doc.select("h1.item-title__primary");
        if (nameHTML.size() > 0)
            return nameHTML.text().toUpperCase();

        // Test for layout 2
        nameHTML = doc.select("h1.ui-pdp-title");
        if (nameHTML.size() > 0)
            return nameHTML.first().text().toUpperCase();

        return "NOT FOUND";
    }

    static String getProductValue(Document doc) {

        // Teste product for layout 1
        Elements priceHTML = doc.select(
                "section.short-description.core-item.short-description--static fieldset.item-price span.price-tag");
        if (priceHTML.size() > 0) {
            String price;
            // Test product descount
            if (priceHTML.size() > 1) {
                Elements descountHTML = doc.select("fieldset.item-price div.price-tag.discount-arrow.arrow-left");
                price = priceHTML.get(1).text().replaceAll(" ", "") + " "
                        + descountHTML.first().text().replaceAll(" ", "");

            } else {
                price = priceHTML.get(0).text().replaceAll(" ", "");
            }

            return price;
        }

        // Test product for layout 2
        priceHTML = doc.select("div.ui-pdp-price.mt-16.ui-pdp-price--size-large");
        if (priceHTML.size() > 0) {
            String price = priceHTML.select("span.price-tag.ui-pdp-price__part").text().replaceAll(" ", "");
            Elements descountHTML = priceHTML.select("span.ui-pdp-price__second-line__label.ui-pdp-color--GREEN");
            // Test product descount
            if (descountHTML.size() > 0)
                price += " " + descountHTML.text().replaceAll(" ", "");

            return price;
        }

        return "NOT FOUND";
    }

    static String getProductAvailability(Document doc) {

        // test for layout 1
        Elements availabilityHTML = doc.select("p.stock-information--available--title");
        if (availabilityHTML.size() > 0)
            return availabilityHTML.first().text();

        // test for layout 2
        availabilityHTML = doc.select("div.ui-pdp-stock-information.mt-4 h3");
        if (availabilityHTML.size() > 0)
            return availabilityHTML.first().text();

        return "NOT FOUND";
    }

    static String getProductFeatures(Document doc) {
        // Atrributes only exists in layout 2
        Elements featuresHTML = doc.select("ul.ui-pdp-features.mt-24 li");
        if (!featuresHTML.text().equals("")) {
            String features = "";
            for (Element li : featuresHTML)
                features += li.text() + " - ";

            return features;
        }

        return "NOT FOUND";
    }

    static String getProductDescription(Document doc) {
        // test for layout 1
        Elements descriptionHTML = doc.select("section.main-section.item-description p");
        if (!descriptionHTML.text().equals("")) {
            return descriptionHTML.text();
        }

        // test for layout 2
        descriptionHTML = doc.select("p.ui-pdp-description__content");
        if (!descriptionHTML.text().equals("")) {
            return descriptionHTML.text();
        }

        return "NOT FOUND";
    }

    static String getProductAttributes(Document doc) {
        // Atrributes only exists in layout 2
        Elements attributesHTML = doc.select("div.ui-pdp-specs__table table tr");
        if (!attributesHTML.text().equals("")) {
            String attributes = "";
            for (Element tr : attributesHTML)
                attributes += tr.select("th").text() + ": " + tr.select("td").text() + " - ";

            return attributes;
        }

        return "NOT FOUND";
    }

    public static void main(String[] args) throws Exception {

        String parsedProduct; // var to store data parsed
        Scanner sc = new Scanner(System.in);
        String input;
        ArrayList<String> inputArr = new ArrayList<String>();

        System.out.println("WebScrapper MercadoLivre 0.2v");
        System.out.println("Bem vindo, entre com a URL dos produtos procurados");
        while (!(input = sc.nextLine()).equals("0"))
            inputArr.add(input);

        for (String url : inputArr) {
            try {
                System.out.println("============================================================================");
                // Get DOM from input URL
                final Document document = Jsoup.connect(url).get();

                // Parse product information
                System.out.println(getProductName(document).toUpperCase());
                System.out.println("Price " + getProductValue(document));
                System.out.println("Availaibility: " + getProductAvailability(document));
                System.out.println();
                System.out.println("Features List: \n" + getProductFeatures(document));
                System.out.println();
                System.out.println("Description: \n" + getProductDescription(document));
                System.out.println();
                System.out.println("Attributes Table: \n" + getProductAttributes(document));

            } catch (IllegalArgumentException urlE) {
                System.out.println("URL invalida");
            }

        }

        sc.close();
    }

}
