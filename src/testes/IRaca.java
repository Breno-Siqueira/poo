
package testes;

public class IRaca {

    private String nome;
    private String vestuario;
    IArma arma; // tipo de arma
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVestuario() {
        return vestuario;
    }

    public void setVestuario(String vestuario) {
        this.vestuario = vestuario;
    }

    public IArma getArma() {
        return arma;
    }

    public void setArma(IArma arma) {
        this.arma = arma;
    }
    
    
    public void setName(String name){
        nome = name;
        
    }
    
    public String getName(String name){
        
        return nome;
    }
    
}
