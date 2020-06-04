package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Provaquestao;
import model.Resultado;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-02T16:07:53")
@StaticMetamodel(Prova.class)
public class Prova_ { 

    public static volatile SingularAttribute<Prova, Long> idProva;
    public static volatile ListAttribute<Prova, Resultado> resultadoList;
    public static volatile SingularAttribute<Prova, Integer> dataProva;
    public static volatile ListAttribute<Prova, Provaquestao> provaquestaoList;

}