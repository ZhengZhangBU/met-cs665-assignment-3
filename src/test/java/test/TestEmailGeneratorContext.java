package test;

import email.generator.VipEmailGenerator;
import org.junit.Test;
import pattern.strategy.EmailGeneratorContext;
import email.generator.BusinessEmailGenerator;

public class TestEmailGeneratorContext {
  @Test
  public void testEmailGenerator() {
    // create a EmailGeneratorContext
    EmailGeneratorContext egc = new EmailGeneratorContext(new BusinessEmailGenerator());
    
    // test if it works by sending the email to custom
    egc.sendEmail();
  }
  
  @Test
  public void testSwapGenerator() {
    // create a EmailGeneratorContext
    EmailGeneratorContext egc = new EmailGeneratorContext(new BusinessEmailGenerator());
    
    // change generator to VipEmailGenerator
    egc.swapEmailGenerator(new VipEmailGenerator());
  
    // test if it works by sending the email to custom
    egc.sendEmail();
  }
}
