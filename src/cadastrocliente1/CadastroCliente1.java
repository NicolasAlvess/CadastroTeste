
package cadastrocliente1;


public class CadastroCliente1 {
    
    public static void main(String[] args) {
      
        //INSTANCIANDO UM OBJETO 
        UiCadastroCliente formularioCadastro = new UiCadastroCliente();
        Pessoa cliente = new Pessoa(1, 
               formularioCadastro.nome,
                formularioCadastro.cpf, 
               formularioCadastro.endereco,
               formularioCadastro.cidade,
               formularioCadastro.estado);
        
    }
    
}
