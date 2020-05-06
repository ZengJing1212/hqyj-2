package com.athqyj.hqyj.Mapper.ym;

import com.athqyj.hqyj.entity.NanYibanqingkuang;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManMapper {
    /*@Insert("insert  into `nan_yibanqingkuang`(`ID`,`islll`,`anemia`,`hypertension`,`heartDisease`,`diabetes`,`epilepsy`,`thyroidDisease`,`chronicNephritis`,`swelling`,`nodule`,`hb`,`sexuallyInfect`,`psyDisorder`,`isIllOthers`,`isIllOthersBox`,`isBornIll`,`isBornIllBox`,`question`,`orchitis`,`varicocele`,`sterility`,`parotitis`,`questionOthers`,`questionOthersBox`,`useMedicine`,`useMedicineBox`,`vaccinate`,`fengzhen`,`yigan`,`vaccinateOthers`,`vaccinateOthersBox`,`intermarryF`,`intermarryFBox`,`diseaseHistoryF`,`thalassaemia`,`albinism`,`bloodSick`,`favism`,`congenitalHeartDisease`,`downSyndrome`,`diabetes1`,`dysgnosia`,`hearingDisorder`,`seeingDisorder`,`infantMortality`,`diseaseHistoryFOthers`,`diseaseHistoryFOthersBox`,`diseaseHistoryFRelationSh`,`meategg`,`hateVeg`,`rawMeat`,`smoking`,`smokingBox`,`secondHandSmoking`,`secondHandSmokingBox`,`drinking`,`drinkingBox`,`drug`,`drugBox`,`newDecoration`,`radial`,`highTemperature`,`noise`,`poisExpo`,`catdog`,`shake`,`leadHg`,`pesticide`,`poisExpoOthers`,`poisExpoOthersBox`,`pressure`,`tenseRelationship`,`economicPressure`,`pregnancyReady`,`otherPressure`,`doctorName`,`examineDate`,`DUPFlag`,`DUpDate`) values \n" +
            "(#{id},#{isIll},#{anemia},#{hypertension},#{heartDisease},#{diabetes},#{epilepsy},#{thyroidDisease},#{chronicNephritis},#{swelling}(10),#{nodule},#{hb},#{sexuallyInfect},#{psyDisorder},NULL,NULL,#{isBornIll},#{isBornIllBox},#{question},#{orchitis}(10),#{varicocele},NULL,NULL,NULL,NULL,#{useMedicine},#{useMedicineBox},#{vaccinate},#{fengzhen},#{yigan}(30),'0',#{vaccinateOthersBox},'0','0',#{diseaseHistoryF},#{thalassaemia},#{albinism},#{bloodSick},#{favism},#{congenitalHeartDisease}(40),#{downSyndrome},'0','0','0','0','0','0',NULL,NULL,1(50),'0','0','0',NULL,NULL,NULL,'0',NULL,'0',NULL(60),NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL(70),NULL,NULL,NULL,NULL,#{pregnancyReady},NULL,#{doctorName},now(),NULL,NULL")*/
    @Insert("insert  into `nan_yibanqingkuang`(`ID`,`islll`,`anemia`,`hypertension`,`heartDisease`,`diabetes`,`epilepsy`,`thyroidDisease`,`chronicNephritis`,`swelling`,`nodule`,`hb`,`sexuallyInfect`,`psyDisorder`,`isIllOthers`,`isIllOthersBox`,`isBornIll`,`isBornIllBox`,`question`,`orchitis`,`varicocele`,`sterility`,`parotitis`,`questionOthers`,`questionOthersBox`,`useMedicine`,`useMedicineBox`,`vaccinate`,`fengzhen`,`yigan`,`vaccinateOthers`,`vaccinateOthersBox`,`intermarryF`,`intermarryFBox`,`diseaseHistoryF`,`thalassaemia`,`albinism`,`bloodSick`,`favism`,`congenitalHeartDisease`,`downSyndrome`,`diabetes1`,`dysgnosia`,`hearingDisorder`,`seeingDisorder`,`infantMortality`,`diseaseHistoryFOthers`,`diseaseHistoryFOthersBox`,`diseaseHistoryFRelationSh`,`meategg`,`hateVeg`,`rawMeat`,`smoking`,`smokingBox`,`secondHandSmoking`,`secondHandSmokingBox`,`drinking`,`drinkingBox`,`drug`,`drugBox`,`newDecoration`,`radial`,`highTemperature`,`noise`,`poisExpo`,`catdog`,`shake`,`leadHg`,`pesticide`,`poisExpoOthers`,`poisExpoOthersBox`,`pressure`,`tenseRelationship`,`economicPressure`,`pregnancyReady`,`otherPressure`,`doctorName`,`examineDate`,`DUPFlag`,`DUpDate`) values \n" +
            "(#{id},#{islll},#{anemia},#{hypertension},#{heartDisease},#{diabetes},#{epilepsy},#{thyroidDisease},#{chronicNephritis},#{swelling},#{nodule},#{hb},#{sexuallyInfect},#{psyDisorder},NULL,NULL,#{isBornIll},#{isBornIllBox},#{question},#{orchitis},#{varicocele},NULL,NULL,NULL,NULL,#{useMedicine},#{useMedicineBox},#{vaccinate},#{fengzhen},#{yigan},'0',#{vaccinateOthersBox},'0','0',#{diseaseHistoryF},#{thalassaemia},#{albinism},#{bloodSick},#{favism},#{congenitalHeartDisease},#{downSyndrome},'0','0','0','0','0','0',NULL,NULL,'1','0','0','0',NULL,NULL,NULL,'0',NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,#{pregnancyReady},NULL,#{doctorName},now(),NULL,NULL)")
    public int addmanInfo(NanYibanqingkuang nanYibanqingkuang);
}

