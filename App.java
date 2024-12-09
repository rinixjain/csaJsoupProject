import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class App {
    public static void main(String[] args) throws Exception {
        // load the amazon file
        String URL = "https://www.amazon.com/Pokemon-TCG-Authentic-Expansion-Holofoils/dp/B001DIJ48C/ref=sr_1_5?crid=IRFYNO54R6NI&dib=eyJ2IjoiMSJ9.vJQYhABkW4Ggr4ASq8rj0iSdrnHOmcKdLEhqX8plX8bflpNqof5Wz1q-cEd1Os2qdaljBjd0GkI2Wqw67DvJR7aW9OIpzJr1DwEclhOFpk4K0XW9rdj7mJImeYxf7fHAJydEDmf09nk_32Ka6ehIJdRLtP_n9MfsH1_-74AC6qRMKDu_RUq0Bwgg5RnQjeAa7yibxqxG2WtDkVsYabHUxGvNVHxGnTt6J1EacLww0OI86jM1u888ees26YgzC3bReNFPHUrchF6ey3-Ig03QWHCHcl5wCEJceDc1ISySU84.JI9eRRVq4xn7zJ8A9n9_sAVu2xloFBgebIZBgVlTohk&dib_tag=se&keywords=pokemon+cards&qid=1733778262&sprefix=pokemon+car%2Caps%2C456&sr=8-5";
        Document document = Jsoup.connect(URL).get();

        // get the html with the data (scraping)
        //Elements spans = document.select("span[class]");
        Elements reviewText = document.select("div.review-text-content");
        Elements reviewUsername = document.select("div.a-profile-content");
        //Elements reviewStars = document.select("i.a-star-5");//.a-star-4.a-star-3.a-star-2.a-star-1.a-star-0");

        //Elements reviewText = spans.select(".review-text-content");
        //Elements reviewUsername = document.getElementsByClass("a-profile-name");
        //Elements reviewTitle = document.getElementsByClass("review-title");
        //Elements reviewRating = document.getElementsByClass("review-star-rating");
        System.out.println(reviewText);
        System.out.println(reviewUsername);
    }
}
