/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javamail;

import com.mail.Email;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

/**
 *
 * @author soft2
 */
public class JavaMailApp {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    try {
      Email email = new Email();
      email.ConfiguraEmail();
      System.out.println("Email->Enviado com sucesso");
    } catch (Exception x) {
      System.out.print("Erro ao enviar, verifique, senha, sua conexão e tente novamente"); 
    
    }
  }
}
