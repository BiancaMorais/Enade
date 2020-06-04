package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Resultado;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-02T16:07:53")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> nomeUsuario;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile ListAttribute<Usuario, Resultado> resultadoList;
    public static volatile SingularAttribute<Usuario, String> emailUsuario;
    public static volatile SingularAttribute<Usuario, String> tipoUsuario;
    public static volatile SingularAttribute<Usuario, String> senhaUsuario;

}