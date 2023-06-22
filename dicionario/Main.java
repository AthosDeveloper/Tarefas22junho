package tarefas22junho.dicionario;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Dicionario d = new Dicionario();
        d.dicionarios.put("bola", new String("Azul"));
        d.dicionarios.put("dado", new String("amarelo"));
        d.dicionarios.put("boneca", new String("rosa"));
        for (String dicionario: d.dicionarios.keySet()){
            String valor = d.dicionarios.get(dicionario);
            System.out.println(dicionario + " > " + valor);
        }
    }
}
