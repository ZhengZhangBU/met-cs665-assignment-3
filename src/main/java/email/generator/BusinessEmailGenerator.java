/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/14/2023
 * File Name: EmailGenerator.java
 * Description: This class is for generating email generator.
 */

package email.generator;

/**
 * This is the Business EmailGenerator class.
 * This class is responsible for representing a concrete business email generator object.
 */
public class BusinessEmailGenerator extends AbstractEmailGenerator {
  /**
   * business email format.
   *
   * @return business email
   */
  public String generateEmail() {
    String salutation = "Hi, Anonymous";
    String body = "This is a business Email.";
    String closing = "Best,";
    String signature = "Anonymous";
    return salutation + "\n\n" + body + "\n\n" + closing + "\n\n" + signature;
  }
}
