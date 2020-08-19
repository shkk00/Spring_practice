package kr.go.cris.ptl.mng.code.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import kr.go.cris.base.service.BaseServiceImpl;
import kr.go.cris.ptl.mng.code.dao.MngCodeDao;
import kr.go.cris.ptl.mng.code.vo.MngCodeVo;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;



/**
 * <pre>
 * FileName: MngCodeServiceImpl.java
 * Package : kr.go.cris.ptl.mng.code.service
 * 
 * 
 *
 * </pre>
 * @author : sejin
 * @date   : 2016. 1. 19.
 */
@Service
public class MngCodeServiceImpl extends BaseServiceImpl implements MngCodeService {

	@Resource
	private MngCodeDao mngCodeDao;

	/* (비Javadoc)
	 * @see kr.go.cris.ptl.mng.code.service.MngCodeService#insertCdMng(kr.go.cris.ptl.mng.code.vo.MngCodeVo)
	 */
	@Override
	public void insertCdMng(MngCodeVo mngCodeVo) throws IOException , SQLException , NullPointerException {
		mngCodeDao.insertCdMng(mngCodeVo);
	}

	/* (비Javadoc)
	 * @see kr.go.cris.ptl.mng.code.service.MngCodeService#selectCdMng(kr.go.cris.ptl.mng.code.vo.MngCodeVo)
	 */
	@Override
	public List<MngCodeVo> selectCdMng(MngCodeVo mngCodeVo) throws IOException , SQLException , NullPointerException {
		return mngCodeDao.selectCdMng(mngCodeVo);
	}

	/* (비Javadoc)
	 * @see kr.go.cris.ptl.mng.code.service.MngCodeService#updateCdMng(kr.go.cris.ptl.mng.code.vo.MngCodeVo)
	 */
	@Override
	public void updateCdMng(MngCodeVo mngCodeVo) throws IOException , SQLException , NullPointerException {
		mngCodeDao.updateCdMng(mngCodeVo);
	}

	

	/* (비Javadoc)
	 * @see kr.go.cris.ptl.mng.code.service.MngCodeService#getCodeList(java.lang.String)
	 */
	public List<MngCodeVo> getCodeList(String up_cd) throws IOException , SQLException , NullPointerException{
		
		ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = sra.getRequest();
		String lang = String.valueOf(request.getSession().getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME));
		
		MngCodeVo codeVo = new MngCodeVo();
		codeVo.setUp_cd(up_cd);
		codeVo.setUse_yn("Y");
		codeVo.setCd_lang(lang);
		List<MngCodeVo> list = this.selectCdMng(codeVo);
		
		return list;
	}
	

	/* (비Javadoc)
	 * @see kr.go.cris.ptl.mng.code.service.MngCodeService#getCode(java.lang.String, java.lang.String)
	 */
	public MngCodeVo getCode(String up_cd, String cd) throws IOException , SQLException , NullPointerException{
		
		MngCodeVo codeVo = new MngCodeVo();
		codeVo.setUp_cd(up_cd);
		codeVo.setCd(cd);
		codeVo.setUse_yn("Y");
		
		List<MngCodeVo> list  = this.selectCdMng(codeVo);
		
		MngCodeVo vo = null;
		
		if(list.size() >0){
			vo = list.get(0);
		}
		
		return vo;
	}

	@Override
	public void deleteCdMng(MngCodeVo mngCodeVo) throws IOException , SQLException , NullPointerException {
		mngCodeDao.deleteCdMng(mngCodeVo);
	}

	@Override
	public String selectSearchnm(String cd) throws IOException , SQLException , NullPointerException {
		// TODO Auto-generated method stub
		return mngCodeDao.selectSearchnm(cd);
	}

}
