package it.etoken.component.market.dao.mapper;

import it.etoken.base.model.market.entity.PocketAsset;
import it.etoken.base.model.market.entity.PocketAssetExample;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface PocketAssetMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pocket_asset
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	@SelectProvider(type = PocketAssetSqlProvider.class, method = "countByExample")
	long countByExample(PocketAssetExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pocket_asset
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	@DeleteProvider(type = PocketAssetSqlProvider.class, method = "deleteByExample")
	int deleteByExample(PocketAssetExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pocket_asset
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	@Delete({ "delete from pocket_asset", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pocket_asset
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
	@Insert({ "insert into pocket_asset (name, ", "icon, contract_account, ",
			"detail)", "values (#{name,jdbcType=VARCHAR}, ",
			"#{icon,jdbcType=VARCHAR}, #{contractAccount,jdbcType=VARCHAR}, ", "#{detail,jdbcType=LONGVARCHAR})" })
	int insert(PocketAsset record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pocket_asset
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	@InsertProvider(type = PocketAssetSqlProvider.class, method = "insertSelective")
	int insertSelective(PocketAsset record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pocket_asset
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	@SelectProvider(type = PocketAssetSqlProvider.class, method = "selectByExampleWithBLOBs")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "icon", property = "icon", jdbcType = JdbcType.VARCHAR),
			@Result(column = "contract_account", property = "contractAccount", jdbcType = JdbcType.VARCHAR),
			@Result(column = "create_date", property = "createDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "update_date", property = "updateDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "detail", property = "detail", jdbcType = JdbcType.LONGVARCHAR) })
	List<PocketAsset> selectByExampleWithBLOBs(PocketAssetExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pocket_asset
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	@SelectProvider(type = PocketAssetSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "icon", property = "icon", jdbcType = JdbcType.VARCHAR),
			@Result(column = "contract_account", property = "contractAccount", jdbcType = JdbcType.VARCHAR),
			@Result(column = "create_date", property = "createDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "update_date", property = "updateDate", jdbcType = JdbcType.TIMESTAMP) })
	List<PocketAsset> selectByExample(PocketAssetExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pocket_asset
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	@Select({ "select", "id, name, icon, contract_account, create_date, update_date, detail", "from pocket_asset",
			"where id = #{id,jdbcType=BIGINT}" })
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "icon", property = "icon", jdbcType = JdbcType.VARCHAR),
			@Result(column = "contract_account", property = "contractAccount", jdbcType = JdbcType.VARCHAR),
			@Result(column = "create_date", property = "createDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "update_date", property = "updateDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "detail", property = "detail", jdbcType = JdbcType.LONGVARCHAR) })
	PocketAsset selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pocket_asset
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	@UpdateProvider(type = PocketAssetSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") PocketAsset record, @Param("example") PocketAssetExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pocket_asset
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	@UpdateProvider(type = PocketAssetSqlProvider.class, method = "updateByExampleWithBLOBs")
	int updateByExampleWithBLOBs(@Param("record") PocketAsset record, @Param("example") PocketAssetExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pocket_asset
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	@UpdateProvider(type = PocketAssetSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") PocketAsset record, @Param("example") PocketAssetExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pocket_asset
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	@UpdateProvider(type = PocketAssetSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(PocketAsset record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pocket_asset
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	@Update({ "update pocket_asset", "set name = #{name,jdbcType=VARCHAR},", "icon = #{icon,jdbcType=VARCHAR},",
			"contract_account = #{contractAccount,jdbcType=VARCHAR},",
			"create_date = #{createDate,jdbcType=TIMESTAMP},", "update_date = #{updateDate,jdbcType=TIMESTAMP},",
			"detail = #{detail,jdbcType=LONGVARCHAR}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKeyWithBLOBs(PocketAsset record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pocket_asset
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	@Update({ "update pocket_asset", "set name = #{name,jdbcType=VARCHAR},", "icon = #{icon,jdbcType=VARCHAR},",
			"contract_account = #{contractAccount,jdbcType=VARCHAR},",
			"create_date = #{createDate,jdbcType=TIMESTAMP},", "update_date = #{updateDate,jdbcType=TIMESTAMP}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(PocketAsset record);
}