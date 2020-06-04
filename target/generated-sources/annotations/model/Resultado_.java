package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Prova;
import model.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-02T16:07:53")
@StaticMetamodel(Resultado.class)
public class Resultado_ { 

    public static volatile SingularAttribute<Resultado, Prova> idProva;
    public static volatile SingularAttribute<Resultado, Double> valorObtido;
    public static volatile SingularAttribute<Resultado, Usuario> idUsuario;
    public static volatile SingularAttribute<Resultado, Long> idResultado;

}