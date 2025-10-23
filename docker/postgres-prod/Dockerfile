FROM postgres:latest
LABEL authors="epceja"

#Variables de entorno
ENV POSTGRES_DB=db_url
ENV POSTGRES_USER=db_user
ENV POSTGRES_PASSWORD=db_password
ENV PGDATA=/var/lib/postgresql/data/pgdata

#Puerto asignado
EXPOSE 5432

#Checar DB
HEALTHCHECK --interval=30s --timeout=30s --start-period=5s --retries=3 CMD pg_isready -U $POSTGRES_USER $POSTGRES_DB
