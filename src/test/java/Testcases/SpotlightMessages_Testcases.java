package Testcases;

import Basetest.Baseclass;
import PageObjects.Spotlight_Messages;
import org.testng.annotations.Test;

import java.time.Duration;

public class SpotlightMessages_Testcases extends Baseclass {

    public Spotlight_Messages msg;

    Duration timeout = Duration.ofSeconds(100);
    //WebDriverWait wait = new WebDriverWait(driver, timeout);

        @Test
        public void spotlight () {
            msg = new Spotlight_Messages(driver);

            msg.setUsername();
            timeout.withSeconds(100);

            msg.setPassword();
            timeout.withSeconds(100);

            msg.setEyeicon();
            timeout.withSeconds(100);

            msg.setCheckbox();
            timeout.withSeconds(100);

            msg.setSignin();
            timeout.withSeconds(100);

            msg.setNavigate();
            timeout.withSeconds(100);

            msg.setNewmessage();
            timeout.withSeconds(100);

            msg.setCompose();
            timeout.withSeconds(100);

            msg.setUserid();
            timeout.withSeconds(100);

            msg.setSubject();
            timeout.withSeconds(100);

            msg.setCategory();
            timeout.withSeconds(100);

            msg.setTemplate();
            timeout.withSeconds(100);

            msg.seteditor();
            timeout.withSeconds(100);

            msg.setSave();
            timeout.withSeconds(100);
            reports.initiate();

        }
    }


//    public void sleep()
//    {
//        Thread.sleep(2000);
//    }
    /* }

    @Test
    public void NewMess() throws InterruptedException {
        msg = new Spotlight_Messages(driver);*/

