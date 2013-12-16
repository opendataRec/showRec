package opendata.Testes;

import junit.framework.Assert;
import opendata.business.ControllerCategorias;
import opendata.business.Hoteis;
import opendata.persistence.DaoCategorias;
import opendata.util.BusinessExcption;

import org.easymock.EasyMock;
import org.junit.Test;

public class TesteLoadDatas {
	
	@Test
	public void TesteLoad(){
		DaoCategorias dao = EasyMock.createMock(DaoCategorias.class);
		EasyMock.expect(dao.loadData(Hoteis.class)).andReturn(null);
		EasyMock.replay(dao);
		
		ControllerCategorias controller = new ControllerCategorias(dao);
		controller.loadDatas(Hoteis.class);
		EasyMock.verify(dao);
	}
	
	//Teste caminho ruim do caso de levantar um excpetion
	@Test
	public void testeLoadExcption(){
		DaoCategorias dao = EasyMock.createMock(DaoCategorias.class);
		EasyMock.expect(dao.loadData(Hoteis.class)).andThrow(new BusinessExcption("We was find out some mistakes"));
		EasyMock.replay(dao);
		
		ControllerCategorias controller = new ControllerCategorias(dao);
		try{
			controller.loadDatas(Hoteis.class);
			Assert.fail("Ops teste falhou");
		}catch(BusinessExcption e){
			
			
		}
		
		EasyMock.verify(dao);
	}
	//Teste do caso de levantar um erro, teste bom
	@Test
	public void testeLoadExcptionTrue(){
		DaoCategorias dao = EasyMock.createMock(DaoCategorias.class);
		EasyMock.expect(dao.loadData(Hoteis.class)).andReturn(null);
		EasyMock.replay(dao);
		
		ControllerCategorias controller = new ControllerCategorias(dao);
		try{
			controller.loadDatas(Hoteis.class);
			
		}catch(BusinessExcption e){
			Assert.fail("Ops teste falhou");	
			
		}
		
		EasyMock.verify(dao);
	}

}
