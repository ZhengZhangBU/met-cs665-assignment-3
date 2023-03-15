/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/14/2023
 * File Name: EmailGenerator.java
 * Description: This class is responsible for declaring all underlying supported algorithms.
 */

package email.generator;

/**
 * This is the EmailGenerator class.
 * This class is responsible for representing an Email generator.
 */
public interface EmailGenerator {
  
  /**
   *  Generate personalized Email.
   *
   * @return personalized email format.
   */
  public String generateEmail();
  
  /**
   * Send Email to customs.
   *
   * @return send the generated email to customs
   */
  public String sendEmail();
}
