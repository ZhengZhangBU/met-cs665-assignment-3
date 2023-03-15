/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/14/2023
 * File Name: ReturningEmailGenerator.java
 * Description: This class is for generating a returning email.
 */

package email.generator;

/**
 * This is the Returning EmailGenerator class.
 * This class is responsible for representing a concrete returning email generator object.
 */
public class ReturningEmailGenerator extends AbstractEmailGenerator {
  /**
   * Returning email template.
   *
   * @return returning email
   */
  public String generateEmail() {
    String salutation = "Hi, Anonymous";
    String body = "This is a returning Email.";
    String closing = "Best,";
    String signature = "Anonymous";
    return salutation + "\n\n" + body + "\n\n" + closing + "\n\n" + signature;
  }
}
