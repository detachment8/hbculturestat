package com.example.hbculturestat.mapper;

import com.example.hbculturestat.dto.FyAllCity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FyAllCityMapper {

    @Select("SELECT a.unit_name, a.city_code, a.time_point, a.total_asset, a.building_area, b.project_resources, " +
            "b.object, c.total_expenditure, c.basic_expenditure, c.project_expenditure, d.total_income, d.financial_subsidy, " +
            "d.special_protection_fund, e.institution_num, e.staff, f.exhibition_time, f.exhibition_audi, f.training_course, " +
            "f.training_class_num, g.museum, g.apprentice_num, g.study_place " +
            "FROM fy_assets_city a LEFT JOIN fy_census_result_city b ON a.city_code = b.unit_code " +
            "AND a.time_point = b.time_point LEFT JOIN fy_expenditure_city c ON a.city_code = c.unit_code " +
            "AND a.time_point = c.time_point LEFT JOIN fy_income_city d ON a.city_code = d.unit_code " +
            "AND a.time_point = d.time_point LEFT JOIN fy_institution_info_city e ON a.city_code = e.unit_code " +
            "AND a.time_point = e.time_point LEFT JOIN fy_promotional_training_city f ON a.city_code = f.unit_code " +
            "AND a.time_point = f.time_point LEFT JOIN fy_showcase_city g ON a.city_code = g.unit_code " +
            "AND a.time_point = g.time_point WHERE SUBSTR(a.city_code, 1, 6) = #{adminCode} " +
            "AND SUBSTR(a.time_point, 1, 4) = #{year}")
    List<FyAllCity> getFyAllCity(String adminCode,String year);
}
