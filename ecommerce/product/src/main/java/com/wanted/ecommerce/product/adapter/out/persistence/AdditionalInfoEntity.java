package com.wanted.ecommerce.product.adapter.out.persistence;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AdditionalInfoEntity {

    private boolean assemblyRequired;
    private String assemblyTime;

}
