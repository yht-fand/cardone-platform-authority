package top.cardone.api.vx.authority.oAuthConsumer

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.OAuthConsumerService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class m0002 implements java.io.Serializable {
    def input(input) {
        def newInput = [:]

		newInput?.batchNo = input?.batchNo
		newInput?.beginDate = input?.beginDate
		newInput?.clientSecret = input?.clientSecret
		newInput?.createdByCode = input?.createdByCode
		newInput?.createdById = input?.createdById
		newInput?.createdDate = input?.createdDate
		newInput?.dataStateCode = input?.dataStateCode
		newInput?.departmentCode = input?.departmentCode
		newInput?.endDate = input?.endDate
		newInput?.flagCode = input?.flagCode
		newInput?.flagObjectCode = input?.flagObjectCode
		newInput?.jsonData = input?.jsonData
		newInput?.lastModifiedByCode = input?.lastModifiedByCode
		newInput?.lastModifiedById = input?.lastModifiedById
		newInput?.lastModifiedDate = input?.lastModifiedDate
		newInput?.oauthConsumerId = input?.oauthConsumerId
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.personalCode = input?.personalCode
		newInput?.personalId = input?.personalId
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.version = input?.version

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.oAuthConsumerCode)) {
//          throw new CodeException("oAuthConsumerCode required", "授权消费编号必填")
//      }
//
//      if (StringUtils.length(input?.oAuthConsumerCode) < 4) {
//          throw new CodeException("oAuthConsumerCode minlength", "授权消费编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.oAuthConsumerCode) > 255) {
//          throw new CodeException("oAuthConsumerCode maxlength", "授权消费编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "授权消费名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "授权消费名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "授权消费名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['oAuthConsumerCode': input.oAuthConsumerCode, "dataStateCode": "1"]

		def count = ApplicationContextHolder.getBean(OAuthConsumerService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("oAuthConsumerCode already exists", "授权消费编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(OAuthConsumerService.class).findOne(input)
    }

    def output(output) {
        def newOutput = [:]

		newOutput?.batchNo = output?.batch_no
		newOutput?.beginDate = output?.begin_date
		newOutput?.clientSecret = output?.client_secret
		newOutput?.createdByCode = output?.created_by_code
		newOutput?.createdById = output?.created_by_id
		newOutput?.createdDate = output?.created_date
		newOutput?.dataStateCode = output?.data_state_code
		newOutput?.departmentCode = output?.department_code
		newOutput?.endDate = output?.end_date
		newOutput?.flagCode = output?.flag_code
		newOutput?.flagObjectCode = output?.flag_object_code
		newOutput?.jsonData = output?.json_data
		newOutput?.lastModifiedByCode = output?.last_modified_by_code
		newOutput?.lastModifiedById = output?.last_modified_by_id
		newOutput?.lastModifiedDate = output?.last_modified_date
		newOutput?.oauthConsumerId = output?.oauth_consumer_id
		newOutput?.orderBy = output?.order_by_
		newOutput?.orgCode = output?.org_code
		newOutput?.personalCode = output?.personal_code
		newOutput?.personalId = output?.personal_id
		newOutput?.siteCode = output?.site_code
		newOutput?.stateCode = output?.state_code
		newOutput?.systemInfoCode = output?.system_info_code
		newOutput?.version = output?.version_

        newOutput
    }
}