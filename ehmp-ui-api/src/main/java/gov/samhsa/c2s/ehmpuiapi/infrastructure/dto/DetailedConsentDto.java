package gov.samhsa.c2s.ehmpuiapi.infrastructure.dto;

import gov.samhsa.c2s.common.validator.constraint.PresentOrFuture;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.Valid;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ScriptAssert(
        lang = "javascript",
        alias = "_",
        script = "_.startDate != null && _.endDate != null && _.startDate.isBefore(_.endDate)",
        message = "consent end date must be after consent start date")
public class DetailedConsentDto {

    private Long id;

    @Valid
    @NotNull
    private List<ConsentProviderDto> fromProviders = new ArrayList<>();

    @Valid
    @NotNull
    private List<ConsentProviderDto> toProviders = new ArrayList<>();

    @Valid
    @NotNull
    private List<SensitivityCategoryDto> shareSensitivityCategories;

    @Valid
    @NotNull
    private List<PurposeDto> sharePurposes;

    @NotNull
    @PresentOrFuture
    private LocalDate startDate;

    @NotNull
    @Future
    private LocalDate endDate;

    @NotNull
    private ConsentStage consentStage;
}
