/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/14/2023
 * File Name: EmailGenerator.java
 * Description: This class is for generating frequent email.
 */

package email.generator;

/**
 * This is the Frequent EmailGenerator class.
 * This class is responsible for representing a concrete frequent email generator object.
 */
public class FrequentEmailGenerator extends AbstractEmailGenerator {
  /**
   * frequent email format.
   *
   * @return frequent email
   */
  public String generateEmail() {
    String salutation = "Hi, Anonymous";
    String body = "This is a frequent Email that you will receive every week. Good Luck";
    String closing = "Best,";
    String signature = "Anonymous";
    return salutation + "\n\n" + body + "\n\n" + closing + "\n\n" + signature;
  }
}
