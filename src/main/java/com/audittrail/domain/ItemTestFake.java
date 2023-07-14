package com.audittrail.domain;

import com.audittrail.audit.AuditTrailFakeCreatedDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ItemTest")
public class ItemTestFake extends AuditTrailFakeCreatedDate<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
}
