package email.generator;

/**
 * define general characteristics of Email Generator.
 */
public abstract class AbstractEmailGenerator implements EmailGenerator {
  public abstract String generateEmail();
  
  public String sendEmail() {
    return this.generateEmail();
  }
}
