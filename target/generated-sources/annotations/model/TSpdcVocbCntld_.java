package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.TSpdcObjtVocbCntld;
import model.TSpdcPrpdVocbCntld;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-21T18:28:36")
@StaticMetamodel(TSpdcVocbCntld.class)
public class TSpdcVocbCntld_ { 

    public static volatile SingularAttribute<TSpdcVocbCntld, String> dsVocbCntld;
    public static volatile SingularAttribute<TSpdcVocbCntld, String> sgVocbCntld;
    public static volatile CollectionAttribute<TSpdcVocbCntld, TSpdcPrpdVocbCntld> tSpdcPrpdVocbCntldCollection;
    public static volatile SingularAttribute<TSpdcVocbCntld, String> flTipoVocbCntld;
    public static volatile SingularAttribute<TSpdcVocbCntld, Integer> idVocbCntld;
    public static volatile CollectionAttribute<TSpdcVocbCntld, TSpdcObjtVocbCntld> tSpdcObjtVocbCntldCollection;

}