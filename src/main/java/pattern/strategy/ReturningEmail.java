/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/14/2023
 * File Name: BusinessEmail.java
 * Description: This class is for creating business email.
 */

package pattern.strategy;

import email.generator.ReturningEmailGenerator;

/**
 * Business Email.
 */
public class ReturningEmail extends EmailGeneratorContext {
  public ReturningEmail() {
    this.emailGenerator = new ReturningEmailGenerator();
  }
}
