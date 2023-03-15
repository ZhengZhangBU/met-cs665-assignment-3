package test;

import org.junit.Test;
import pattern.strategy.EmailGeneratorContext;
import pattern.strategy.NewEmail;

public class TestNewEmail {
  @Test
  public void testNewEmailCreation() {
    //create a new email
    EmailGeneratorContext newEmail = new NewEmail();
    
    // send email to customs
    newEmail.sendEmail();
  }
}
