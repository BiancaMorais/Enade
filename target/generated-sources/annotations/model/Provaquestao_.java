package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Prova;
import model.Questao;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-04T19:45:19")
@StaticMetamodel(Provaquestao.class)
public class Provaquestao_ { 

    public static volatile SingularAttribute<Provaquestao, Prova> idProva;
    public static volatile SingularAttribute<Provaquestao, Long> idProvaQuestao;
    public static volatile SingularAttribute<Provaquestao, Questao> idQuestao;

}