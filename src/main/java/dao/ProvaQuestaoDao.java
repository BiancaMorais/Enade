/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bd.PersistenceUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Provaquestao;

/**
 *
 * @author bibim
 */
public class ProvaQuestaoDao {
    public static ProvaQuestaoDao pqDao;
    
    public static ProvaQuestaoDao getInstance() {
        if (pqDao == null) {
            pqDao = new ProvaQuestaoDao();
        }
        return pqDao;
    }
    
    public Provaquestao buscar(Long idProvaQuestao) {
        EntityManager em = PersistenceUtil.getEntityManager();
        Query query = em.createQuery("select p from ProvaQuestao p where p.idProvaQuestao =:idProvaQuestao ");
        query.setParameter("idProvaQuestao", idProvaQuestao);

        List<Provaquestao> provaList = query.getResultList();
        if (provaList != null && provaList.size() > 0) {
            return provaList.get(0);
        }
        return null;
    }
    
    public List<Provaquestao> buscarTodas() {
        EntityManager em = PersistenceUtil.getEntityManager();
        Query query = em.createQuery("from ProvaQuestao As p");
        return query.getResultList();
    }
    
    public List<Provaquestao> buscarProvaInstancia() {
        EntityManager em = PersistenceUtil.getEntityManager();
        Query query = em.createQuery("select distinct p from ProvaQuestao p ");
        return query.getResultList();
    }
    
    public void remover(Provaquestao provaquestao) {
        EntityManager em = PersistenceUtil.getEntityManager();
        em.getTransaction().begin();
        if (!em.contains(provaquestao)) {
            provaquestao = em.merge(provaquestao);
        }
        em.remove(provaquestao);
        em.getTransaction().commit();
    }
    
    public Provaquestao persistir(Provaquestao provaquestao) {
        EntityManager em = PersistenceUtil.getEntityManager();
        em.getTransaction().begin();
        try {
            provaquestao = em.merge(provaquestao);
            em.getTransaction().commit();
            System.out.println("Registro provaquestao gravado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return provaquestao;
    }
    
}
