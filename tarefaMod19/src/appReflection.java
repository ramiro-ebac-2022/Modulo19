
import java.lang.reflect.Field;

public class appReflection {
    
  public static void main(String[] args) {

    ClasseTabela tabela = new ClasseTabela("Tabela1");           
    Field[] campos = tabela.getClass().getDeclaredFields();
    //Percorre todos os campos da classe
    for(Field field: campos) {
        //Caso tenha nossa anotação, imprime o nome e o valor passado como parâmetro
        if(field.isAnnotationPresent(AnotacaoTabela.class)) {
            AnotacaoTabela anotacao = field.getAnnotation(AnotacaoTabela.class);
            System.out.println("Anotação : "+anotacao.toString());
            System.out.println("Parâmetro da anotação : "+anotacao.value());
        }
     }   
    }
}
