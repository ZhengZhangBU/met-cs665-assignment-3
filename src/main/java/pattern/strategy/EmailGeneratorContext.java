/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/14/2023
 * File Name: EmailGeneratorContext.java
 * Description: This class is for declaring a concrete strategy object.
 */

package pattern.strategy;

import email.generator.EmailGenerator;

/**
 * This is the EmailGenerator class.
 * This class is responsible for representing a concrete email generator object.
 */
public class EmailGeneratorContext {
  
  public EmailGenerator emailGenerator;
  
  public EmailGeneratorContext() {}
  
  public EmailGeneratorContext(EmailGenerator emailGenerator) {
    this.emailGenerator = emailGenerator;
  }
  
  /**
   * Generate specific email format.
   */
  public void sendEmail() {
    System.out.println(emailGenerator.sendEmail());
  }

  /**
   * Swap new Email generator.
   *
   * @param newEmailGenerator new Email Generator
   */
  public void swapEmailGenerator(EmailGenerator newEmailGenerator) {
    this.emailGenerator = newEmailGenerator;
  }
}
