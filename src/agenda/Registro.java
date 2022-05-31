package agenda;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Registro {
     public static void main(String[] args) {
        
          Scanner teclado = new Scanner(System.in);
          int opcion;
          int telefono;
          String nombre;
          String endereco;
          int cpf;
          int idade;
          Contacto contacto; 
          int  tamanhoAgenda;
          
          tamanhoAgenda = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o número de contatos para sua agenda:"));
          Agenda agendaTelefonica = new Agenda(
                  tamanhoAgenda);
          
          do{
              System.out.println("\n\tBEM VINDO A AGENDA TELEFONICA");
              System.out.println("1 . Adicionar contato");
              System.out.println("2 . Listar contatos");
              System.out.println("3 . Buscar un contato");
              System.out.println("4 . Comprovar se existe um contacto");
              System.out.println("5 . Eliminar contato");
              System.out.println("6 . Comprovar contatos disponiveis");
              System.out.println("7 . Comprovar se a agenda esta cheia");
              System.out.println("8 . Sair");
              System.out.print("Digite uma opcao porfavor : ");
              opcion = teclado.nextInt();
              
              switch(opcion){
                
                  case 1:
                      System.out.print("\nDigite seu nome : ");
                      nombre = teclado.next();
                      
                      System.out.print("Digite seu telefone : ");
                      telefono = teclado.nextInt();
                      
                      System.out.println("Digite seu cpf : ");
                      cpf = teclado.nextInt();
                      
                      System.out.println("Digite seu endereco : ");
                      endereco = teclado.next();
                      
                      System.out.println("Digite sua idade : ");
                      idade = teclado.nextInt();
                      
                      contacto = new Contacto(nombre,telefono,cpf,endereco,idade);
                      agendaTelefonica.adirContacto(contacto);
                      System.out.println("");
                      break;
                      
             
                  case 2:
                      System.out.println("");
                      agendaTelefonica.listarContactos();
//                      System.out.println("trdyr"+agendaTelefonica);
                      break;
                      
                  
                  case 3:
                      System.out.print("\nDigite un nombre : ");
                      nombre = teclado.next();
                      
                      
                      agendaTelefonica.buscarContacto(nombre);
                      System.out.println("");
                      break;
                      
               
                  case 4:
                      System.out.print("\nDigite seu nombre : ");
                      nombre = teclado.next();
                     
                      contacto = new Contacto(nombre);
                      if(agendaTelefonica.comprobarSiExisteContacto(contacto)){
                          System.out.println("\nO contato existe" +nombre);
                      }
                      else{
                          System.out.println("\nO contacto nao existe");
                      }
                      System.out.println("");
                      break;
                      
            
                  case 5:
                      System.out.print("\nInforme o nome : ");
                      nombre = teclado.next();
                      contacto = new Contacto(nombre);
                      agendaTelefonica.eliminarContacto(contacto);
                      System.out.println("");
                      break;
            
            
                  case 6:
                      System.out.println("\nHa " + agendaTelefonica.comprobarSiHayHuecosLibres() + " contatos");
                      System.out.println("");
                      break;
                      
             
                  case 7:
                      if(agendaTelefonica.comprobarSiLaAgendaEstaLlena()){
                          System.out.println("\nA agenda esta cheia");
                      }else{
                          System.out.println("\nAinda pode registrar contatos");
                      }
                      System.out.println("");         
                      break;
                      
                  case 8:
                      System.out.println("\nObrigado por participar !!!");
                      opcion = 8;
                      break;
                      
                  default:
                      System.out.println("\nOpcao invalida , por favor selecione outra opcao");
                      System.out.println("");
                      break;
              }
          }while(opcion != 8);
    }
}