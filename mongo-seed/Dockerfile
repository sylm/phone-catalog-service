FROM mongo

COPY init.json /init.json
CMD mongoimport --host mongo --db data --collection phones --type json --file /init.json --jsonArray