/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/14/2023
 * File Name: NewEmail.java
 * Description: This class is for creating new email.
 */

package pattern.strategy;

import email.generator.NewEmailGenerator;

/**
 * New Email.
 */
public class NewEmail extends EmailGeneratorContext {
  public NewEmail() {
    this.emailGenerator = new NewEmailGenerator();
  }
}
