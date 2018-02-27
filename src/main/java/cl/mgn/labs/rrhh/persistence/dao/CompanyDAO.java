/**
 * 
 */
package cl.mgn.labs.rrhh.persistence.dao;

import java.util.List;

import cl.mgn.labs.rrhh.core.company.Company;

/**
 * ---------------------------------------------------------------------------
 * MGNlabs 2014 - 2017 
 * Gestion de Recursos Humanos -
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 19-12-2017
 * Description : 
 * ---------------------------------------------------------------------------
 */
public class CompanyDAO extends GenericDAO<Company>{

	@Override
	public Company find(Company object) {
		return this.getConnection().findById( object.getId(), Company.class );
	}

	@Override
	public List<Company> findAll() {
		return this.getConnection().findAll(Company.class);
	}

	@Override
	public void update(Company object) {
		
	}
}
