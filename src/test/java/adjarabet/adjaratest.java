package adjarabet;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class adjaratest {
    @Test
    public  void registration (){
        Configuration.browser = "chrome";
        open ("https://www.adjarabet.com/ka");
        $ (byAttribute("data-id","register-btn")).click();
        $ (byText("შექმენი ახალი ანგარიში")).shouldBe(Condition.visible, Duration.ofMillis(3000));
        $ (byAttribute("data-id","signUpFormFirstOfThree_firstname")).setValue("nana");$ (byAttribute("data-id","signUpFormFirstOfThree_lastname")).setValue("sachaneli");
        $ (byText("მდედრობითი")).click();
        $ (byAttribute("data-id","signUpFormFirstOfThree_country")).click();
        $ (byText("ანგილია")).click();
        $ (byAttribute("data-id","signUpFormFirstOfThree_documentType")).click();
        $ (byText("პირადობის მოწმობა")).click();

        $ (byAttribute("data-id","signUpFormFirstOfThree_personalId")).setValue("01017017640");
        $ (byAttribute("data-id","signUpFormFirstOfThree_phoneNumber")).setValue("555390937");
        $ (byAttribute("data-id","signUpFormFirstOfThree_username")).setValue("nana1981");
        $ (byAttribute("data-id","signUpFormFirstOfThree_password")).setValue("Adjaratest!1");
        $ (byText("გაგრძელება")).shouldBe(Condition.enabled);




        sleep(5000);


    }
}