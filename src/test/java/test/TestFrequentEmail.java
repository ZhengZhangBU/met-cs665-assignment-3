package test;

import org.junit.Test;
import pattern.strategy.EmailGeneratorContext;
import pattern.strategy.FrequentEmail;

public class TestFrequentEmail {
  @Test
  public void testFrequentEmailCreation() {
    // create a frequent email
    EmailGeneratorContext frequentEmail = new FrequentEmail();
    
    // send email to customs
    frequentEmail.sendEmail();
  }
}
