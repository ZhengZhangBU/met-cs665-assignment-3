/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/14/2023
 * File Name: EmailGenerator.java
 * Description: This class is for generating a new email.
 */

package email.generator;

/**
 * This is the NewEmailGenerator class.
 * This class is responsible for representing a concrete new email generator object.
 */
public class NewEmailGenerator extends AbstractEmailGenerator {
  /**
   * new email format.
   *
   * @return frequent email
   */
  public String generateEmail() {
    String salutation = "Hi, Anonymous";
    String body = "This is a new email";
    String closing = "Best,";
    String signature = "Anonymous";
    return salutation + "\n\n" + body + "\n\n" + closing + "\n\n" + signature;
  }
}
