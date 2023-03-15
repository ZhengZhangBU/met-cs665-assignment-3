/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/14/2023
 * File Name: BusinessEmail.java
 * Description: This class is for creating business email.
 */

package pattern.strategy;

import email.generator.BusinessEmailGenerator;

/**
 * Business Email.
 */
public class BusinessEmail extends EmailGeneratorContext {
  public BusinessEmail() {
    this.emailGenerator = new BusinessEmailGenerator();
  }
}
