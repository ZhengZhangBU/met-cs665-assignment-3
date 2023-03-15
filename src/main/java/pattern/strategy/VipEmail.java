/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/14/2023
 * File Name: VipEmail.java
 * Description: This class is for creating VIP email.
 */

package pattern.strategy;

import email.generator.VipEmailGenerator;

/**
 * VIP Email.
 */
public class VipEmail extends EmailGeneratorContext {
  public VipEmail() {
    this.emailGenerator = new VipEmailGenerator();
  }
}
