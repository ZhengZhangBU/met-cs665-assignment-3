/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/14/2023
 * File Name: FrequentEmail.java
 * Description: This class is for creating Frequent email.
 */

package pattern.strategy;

import email.generator.FrequentEmailGenerator;

/**
 * Frequent Email.
 */
public class FrequentEmail extends EmailGeneratorContext {
  public FrequentEmail() {
    this.emailGenerator = new FrequentEmailGenerator();
  }
}
