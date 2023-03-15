package test;

import org.junit.Test;
import pattern.strategy.BusinessEmail;
import pattern.strategy.EmailGeneratorContext;

public class TestBusinessEmail {
  @Test
  public void testBusinessCreation() {
    // create a business Email context
    EmailGeneratorContext businessEmail = new BusinessEmail();
    
    // send business to customs
    businessEmail.sendEmail();
  }
}
