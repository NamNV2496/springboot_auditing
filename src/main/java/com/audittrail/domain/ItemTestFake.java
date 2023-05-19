package com.audittrail.domain;

import com.audittrail.audit.AuditTrail;
import com.audittrail.audit.AuditTrailFakeCreatedDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
