package test;

import org.junit.Test;
import pattern.strategy.EmailGeneratorContext;
import pattern.strategy.VipEmail;

public class TestVipEmail {
  @Test
  public void testVipEmailCreation() {
    // create a VIP email
    EmailGeneratorContext vipEmail = new VipEmail();
    
    // send email to customs
    vipEmail.sendEmail();
  }
}
