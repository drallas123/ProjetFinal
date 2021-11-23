package be.digitalcity.projetfinal.projetbfappservice.mappers;

public interface BaseMapper<TDTO, TFORM,TENTITY> {

    TENTITY toEntity(TDTO dto);
    TDTO toDto(TENTITY entity);
    TENTITY fromFormToEntity(TFORM form);

}
