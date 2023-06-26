package fr.eni.groupe8.enchere.bll;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.groupe8.enchere.dal.ArticlesDAO;


@Service
public class ArticlesServiceImpl implements ArticlesService {

private ArticlesDAO articlesDAO;
	
	public ArticlesServiceImpl(ArticlesDAO articlesDAO) {
		this.articlesDAO = articlesDAO;
	}
	
	@Override
	public List<Articles> findAllArticles() {
		// TODO Auto-generated method stub
		return articlesDAO.findAll();
	}

}
