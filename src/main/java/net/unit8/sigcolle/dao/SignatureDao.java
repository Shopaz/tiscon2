package net.unit8.sigcolle.dao;

import java.util.List;

import net.unit8.sigcolle.DomaConfig;
import net.unit8.sigcolle.model.Signature;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 * @author kawasima
 */
@Dao(config = DomaConfig.class)
public interface SignatureDao {
    @Select
    int countByCampaignId(Long campaignId);

    @Select
    List<Signature> selectAllByCampaignId(Long campaignId);

    @Insert
    int insert(Signature signature);

    @Select
    Signature selectBySignatureId(Long signatureId);

    @Update
    int update(Signature signature);
}
