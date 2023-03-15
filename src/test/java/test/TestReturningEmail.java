package test;

import org.junit.Test;
import pattern.strategy.EmailGeneratorContext;
import pattern.strategy.ReturningEmail;

public class TestReturningEmail {
  @Test
  public void testReturningEmailCreation() {
    // create a returning email
    EmailGeneratorContext returningEmail = new ReturningEmail();
    
    // send email to customs
    returningEmail.sendEmail();
  }
}
