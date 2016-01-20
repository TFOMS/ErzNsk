package message;

import help.RandomGUID;

import java.io.IOException;

import org.jdom2.Element;
import org.jdom2.Namespace;

public class MessageA03p07 extends MessageCommon {
	
	public MessageA03p07() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MessageA03p07(int pERSON_SERDOC, int pERSON_NUMDOC,
			int pERSON_DOCPERSONID, int pERSON_SURNAME,
			int pERSON_KINDFIRSTNAME, int pERSON_KINDLASTNAME,
			int pERSON_BIRTHDAY, int pERSON_SEX,
			int pERSON_LINKSMOESTABLISHMENTID, int eNP, int pERSON_ADDRESSID,
			int pERSON_DATEINPUT, int sNILS, int bORN, int dATEPASSPORT,
			int eNP_PA, int vS_NUM, int vS_DATE, int zAD, int d2, int sMO,
			int d_12, int d_13, int oKATO_3, int tYPE_POL, int pOL, int eNP_1,
			int eNP_2, int p14cx1, int p14cx5, int p14cx6, int p14cx7,
			int xPN1, int xPN2, int xPN3, int uSERNAME, int zADMINUS1,
			int zADPLUS40, int nBLANC, int vS_DATEPLUS1, int uSER_ENP,
			int uSER_PERSON_SURNAME, int uSER_PERSON_KINDFIRSTNAME,
			int uSER_PERSON_KINDLASTNAME, int uSER_SMO, int uSER_D_12,
			int uSER_D_13, int uSER_OKATO_3, int uSER_TYPE_POL, int uSER_POL,
			int rUSSIAN, int d_V, int d_SER, int d_NUM, int pR_FAM, int pR_IM,
			int pR_OT, int lAST_FAM, int lAST_IM, int lAST_OT, int lAST_DR,
			int pFR_SNILS, int pFR_ID, int pFR_NOTID, int uSER_SERDOC,
			int uSER_NUMDOC, int uSER_DOCID, int uSER_DOC_DATE, int d_12_PLUS1) {
		super(pERSON_SERDOC, pERSON_NUMDOC, pERSON_DOCPERSONID, pERSON_SURNAME,
				pERSON_KINDFIRSTNAME, pERSON_KINDLASTNAME, pERSON_BIRTHDAY, pERSON_SEX,
				pERSON_LINKSMOESTABLISHMENTID, eNP, pERSON_ADDRESSID, pERSON_DATEINPUT,
				sNILS, bORN, dATEPASSPORT, eNP_PA, vS_NUM, vS_DATE, zAD, d2, sMO, d_12,
				d_13, oKATO_3, tYPE_POL, pOL, eNP_1, eNP_2, p14cx1, p14cx5, p14cx6,
				p14cx7, xPN1, xPN2, xPN3, uSERNAME, zADMINUS1, zADPLUS40, nBLANC,
				vS_DATEPLUS1, uSER_ENP, uSER_PERSON_SURNAME, uSER_PERSON_KINDFIRSTNAME,
				uSER_PERSON_KINDLASTNAME, uSER_SMO, uSER_D_12, uSER_D_13, uSER_OKATO_3,
				uSER_TYPE_POL, uSER_POL, rUSSIAN, d_V, d_SER, d_NUM, pR_FAM, pR_IM,
				pR_OT, lAST_FAM, lAST_IM, lAST_OT, lAST_DR, pFR_SNILS, pFR_ID,
				pFR_NOTID, uSER_SERDOC, uSER_NUMDOC, uSER_DOCID, uSER_DOC_DATE,
				d_12_PLUS1);
		// TODO Auto-generated constructor stub
	}
	protected void createMiddle(int count, Namespace namespace,	Element rootElement, String curDate) {
		
		for (int i = 1; i < count; i++) {
			
			Element adt_a01 = new Element("ADT_A03", namespace);
			rootElement.addContent(adt_a01);

			RandomGUID guidMsh = createMsh(namespace, curDate, adt_a01, "ADT", "A03", "ADT_A03");	
				
			Element evn = new Element("EVN", namespace);
			adt_a01.addContent(evn);
			evn.addContent(new Element("EVN.2", namespace).addContent(curDate));
			evn.addContent(new Element("EVN.4", namespace).addContent("�07"));

			Element pid = new Element("PID", namespace);
			adt_a01.addContent(pid);
			
			Element pid3_1 = new Element("PID.3", namespace);
			pid.addContent(pid3_1);
			String seria = dataList.get(i).get(USER_SERDOC);
			pid3_1.addContent(new Element("CX.1", namespace).addContent((("".equals(seria) || seria == null) ? "" : seria + " � ") + dataList.get(i).get(USER_NUMDOC)));
			pid3_1.addContent(new Element("CX.5", namespace).addContent(dataList.get(i).get(USER_DOCID)));
			pid3_1.addContent(new Element("CX.7", namespace).addContent(dataList.get(i).get(USER_DOC_DATE)));

			Element pid5 = new Element("PID.5", namespace);
			pid.addContent(pid5);
			pid5.addContent(new Element("XPN.1", namespace)
			.addContent(new Element("FN.1", namespace).addContent(dataList.get(i).get(USER_PERSON_SURNAME))));
			pid5.addContent(new Element("XPN.2", namespace).addContent(dataList.get(i).get(USER_PERSON_KINDFIRSTNAME)));
			pid5.addContent(new Element("XPN.3", namespace).addContent(dataList.get(i).get(USER_PERSON_KINDLASTNAME)));

			pid.addContent(new Element("PID.7", namespace).addContent(dataList.get(i).get(USER_SMO)));
			
			pid.addContent(new Element("PID.8", namespace).addContent(dataList.get(i).get(USER_POL)));
			
			pid.addContent( new Element("PID.23", namespace).addContent(dataList.get(i).get(USER_TYPE_POL)));

			Element pid26 = new Element("PID.26", namespace);
			pid.addContent(pid26);
			pid26.addContent(new Element("CWE.1", namespace).addContent("RUS"));
			pid26.addContent(new Element("CWE.3", namespace).addContent("1.2.643.2.40.5.0.25.3"));
			
			pid.addContent( new Element("PID.29", namespace).addContent(dataList.get(i).get(USER_D_12)));
			pid.addContent( new Element("PID.30", namespace).addContent("Y"));

			adt_a01.addContent(new Element("PV1", namespace).addContent(new Element("PV1.2", namespace).addContent("1")));
			
			listGuid(guidMsh, i, "107");
		}
		}
	
		protected void createMiddle(int count, Namespace namespace,	Element rootElement, String curDate, boolean tt)
		{
		for (int i =0; i < count; i++) {
			
			Element adt_a01 = new Element("ADT_A03", namespace);
			rootElement.addContent(adt_a01);

			RandomGUID guidMsh = createMsh(namespace, curDate, adt_a01, "ADT", "A03", "ADT_A03");	
				
			Element evn = new Element("EVN", namespace);
			adt_a01.addContent(evn);
			evn.addContent(new Element("EVN.2", namespace).addContent(curDate));
			evn.addContent(new Element("EVN.4", namespace).addContent("�07"));

			Element pid = new Element("PID", namespace);
			adt_a01.addContent(pid);
			
			Element pid3_1 = new Element("PID.3", namespace);
			pid.addContent(pid3_1);
			String seria = dataList.get(i).get(USER_SERDOC);
			pid3_1.addContent(new Element("CX.1", namespace).addContent((("".equals(seria) || seria == null) ? "" : seria + " � ") + dataList.get(i).get(USER_NUMDOC)));
			pid3_1.addContent(new Element("CX.5", namespace).addContent(dataList.get(i).get(USER_DOCID)));
			pid3_1.addContent(new Element("CX.7", namespace).addContent(dataList.get(i).get(USER_DOC_DATE)));

			Element pid5 = new Element("PID.5", namespace);
			pid.addContent(pid5);
			pid5.addContent(new Element("XPN.1", namespace)
			.addContent(new Element("FN.1", namespace).addContent(dataList.get(i).get(USER_PERSON_SURNAME))));
			pid5.addContent(new Element("XPN.2", namespace).addContent(dataList.get(i).get(USER_PERSON_KINDFIRSTNAME)));
			pid5.addContent(new Element("XPN.3", namespace).addContent(dataList.get(i).get(USER_PERSON_KINDLASTNAME)));

			pid.addContent(new Element("PID.7", namespace).addContent(dataList.get(i).get(USER_SMO)));
			
			pid.addContent(new Element("PID.8", namespace).addContent(dataList.get(i).get(USER_POL)));
			
			pid.addContent( new Element("PID.23", namespace).addContent(dataList.get(i).get(USER_TYPE_POL)));

			Element pid26 = new Element("PID.26", namespace);
			pid.addContent(pid26);
			pid26.addContent(new Element("CWE.1", namespace).addContent("RUS"));
			pid26.addContent(new Element("CWE.3", namespace).addContent("1.2.643.2.40.5.0.25.3"));
			
			pid.addContent( new Element("PID.29", namespace).addContent(dataList.get(i).get(USER_D_12)));
			pid.addContent( new Element("PID.30", namespace).addContent("Y"));

			adt_a01.addContent(new Element("PV1", namespace).addContent(new Element("PV1.2", namespace).addContent("1")));
			
			listGuid(guidMsh, i, "107");
		}
		}
		@Override
		protected void createMiddle(int count, Namespace namespace,
				Element rootElement, String curDate, boolean tt, String kluch) {
			// TODO Auto-generated method stub
			
		}


}