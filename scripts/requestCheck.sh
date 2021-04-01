#!/bin/bash

host=https://localhost:9000
host=https://summer-brightness-83471.herokuapp.com

echo "waking up..."
curl --silent --output /dev/null -X GET "$host/generate" &
wait

run() {
    for i in {0..3000}
        do
            printf "-"
            curl --silent --output /dev/null -w "%{http_code}" -X GET "$host/generate" &
            #curl  --silent --output /dev/null -w "%{http_code}" -X POST "$host/update" -d '{"articleId":3,"headlines":[{"articleId":4,"generateeIds":[1]},{"articleId":3,"generateeIds":[1]},{"articleId":5,"generateeIds":[1]},{"articleId":0,"generateeIds":[1]},{"articleId":1,"generateeIds":[1]},{"articleId":2,"generateeIds":[1]}]}' -H "Content-Type: application/json"  &
        done
}

for j in {0..1}
    do
        start=$SECONDS

        run 

        wait

        duration=$(( SECONDS - start ))

        echo ""
        echo $duration

        printf "j: "
        printf $j
        printf "   "
        dt=$(date '+%d/%m/%Y %H:%M:%S');
        echo "$dt"
        if [[ ${duration} -gt 10 ]]; then
            break
        fi
        continue
    done