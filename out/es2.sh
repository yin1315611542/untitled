    # 获取所有索引名称
    INDEX_NAMES=$(curl -s "$ELASTICSEARCH_HOST/_cat/indices" | awk '{print $3}')
    # 循环删除每个索引90之前的数据
    for INDEX_NAME in $INDEX_NAMES; do
      echo -n "删除索引【$INDEX_NAME】前三个月的数据  "
      QUERY="{\"query\":{\"range\":{\"updateTime\":{\"lt\":\"now-50d/d\"}}}}"
      curl -X POST "$ELASTICSEARCH_HOST/$INDEX_NAME/_delete_by_query" -H 'Content-Type: application/json' -d "$QUERY"
      echo
    done