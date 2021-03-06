PGDMP     )    
                x            Proyecto    12.2    12.2     )           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            *           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            +           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ,           1262    16415    Proyecto    DATABASE     �   CREATE DATABASE "Proyecto" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Spain.1252' LC_CTYPE = 'Spanish_Spain.1252';
    DROP DATABASE "Proyecto";
                postgres    false                        2615    16416    proyecto    SCHEMA        CREATE SCHEMA proyecto;
    DROP SCHEMA proyecto;
                postgres    false            �            1259    16447    cliente    TABLE     �   CREATE TABLE proyecto.cliente (
    id_cliente integer NOT NULL,
    nombre text,
    telefono integer,
    email text,
    direccion text,
    fecha_creacion timestamp with time zone
);
    DROP TABLE proyecto.cliente;
       proyecto         heap    postgres    false    6            �            1259    16435    estilo    TABLE     h   CREATE TABLE proyecto.estilo (
    id_estilo integer NOT NULL,
    nombre text,
    descripcion text
);
    DROP TABLE proyecto.estilo;
       proyecto         heap    postgres    false    6            �            1259    16417 
   exposicion    TABLE     �   CREATE TABLE proyecto.exposicion (
    id_exposicion integer NOT NULL,
    titulo text,
    descripcion text,
    fecha_creacion timestamp with time zone
);
     DROP TABLE proyecto.exposicion;
       proyecto         heap    postgres    false    6            �            1259    16453    obra    TABLE     �   CREATE TABLE proyecto.obra (
    id_obra integer NOT NULL,
    titulo text,
    descripcion text,
    precio numeric,
    fecha_creacion timestamp with time zone,
    id_cliente integer,
    id_estilo integer
);
    DROP TABLE proyecto.obra;
       proyecto         heap    postgres    false    6            �            1259    16459    obra_expocision    TABLE     �   CREATE TABLE proyecto.obra_expocision (
    id_obra_exposicion integer NOT NULL,
    id_obra integer,
    id_exposicion integer
);
 %   DROP TABLE proyecto.obra_expocision;
       proyecto         heap    postgres    false    6            $          0    16447    cliente 
   TABLE DATA           c   COPY proyecto.cliente (id_cliente, nombre, telefono, email, direccion, fecha_creacion) FROM stdin;
    proyecto          postgres    false    205          #          0    16435    estilo 
   TABLE DATA           B   COPY proyecto.estilo (id_estilo, nombre, descripcion) FROM stdin;
    proyecto          postgres    false    204   $       "          0    16417 
   exposicion 
   TABLE DATA           Z   COPY proyecto.exposicion (id_exposicion, titulo, descripcion, fecha_creacion) FROM stdin;
    proyecto          postgres    false    203   A       %          0    16453    obra 
   TABLE DATA           m   COPY proyecto.obra (id_obra, titulo, descripcion, precio, fecha_creacion, id_cliente, id_estilo) FROM stdin;
    proyecto          postgres    false    206   ^       &          0    16459    obra_expocision 
   TABLE DATA           W   COPY proyecto.obra_expocision (id_obra_exposicion, id_obra, id_exposicion) FROM stdin;
    proyecto          postgres    false    207   {       �
           2606    16463    cliente id_cliente 
   CONSTRAINT     Z   ALTER TABLE ONLY proyecto.cliente
    ADD CONSTRAINT id_cliente PRIMARY KEY (id_cliente);
 >   ALTER TABLE ONLY proyecto.cliente DROP CONSTRAINT id_cliente;
       proyecto            postgres    false    205            �
           2606    16465    estilo id_estilo 
   CONSTRAINT     W   ALTER TABLE ONLY proyecto.estilo
    ADD CONSTRAINT id_estilo PRIMARY KEY (id_estilo);
 <   ALTER TABLE ONLY proyecto.estilo DROP CONSTRAINT id_estilo;
       proyecto            postgres    false    204            �
           2606    16469    exposicion id_exposicion 
   CONSTRAINT     c   ALTER TABLE ONLY proyecto.exposicion
    ADD CONSTRAINT id_exposicion PRIMARY KEY (id_exposicion);
 D   ALTER TABLE ONLY proyecto.exposicion DROP CONSTRAINT id_exposicion;
       proyecto            postgres    false    203            �
           2606    16467    obra id_obra 
   CONSTRAINT     Q   ALTER TABLE ONLY proyecto.obra
    ADD CONSTRAINT id_obra PRIMARY KEY (id_obra);
 8   ALTER TABLE ONLY proyecto.obra DROP CONSTRAINT id_obra;
       proyecto            postgres    false    206            �
           2606    16471 "   obra_expocision id_obra_expocision 
   CONSTRAINT     r   ALTER TABLE ONLY proyecto.obra_expocision
    ADD CONSTRAINT id_obra_expocision PRIMARY KEY (id_obra_exposicion);
 N   ALTER TABLE ONLY proyecto.obra_expocision DROP CONSTRAINT id_obra_expocision;
       proyecto            postgres    false    207            �
           1259    16498    fki_id_cliente    INDEX     G   CREATE INDEX fki_id_cliente ON proyecto.obra USING btree (id_cliente);
 $   DROP INDEX proyecto.fki_id_cliente;
       proyecto            postgres    false    206            �
           1259    16492    fki_id_estilo    INDEX     E   CREATE INDEX fki_id_estilo ON proyecto.obra USING btree (id_estilo);
 #   DROP INDEX proyecto.fki_id_estilo;
       proyecto            postgres    false    206            �
           1259    16515    fki_id_expocision    INDEX     X   CREATE INDEX fki_id_expocision ON proyecto.obra_expocision USING btree (id_exposicion);
 '   DROP INDEX proyecto.fki_id_expocision;
       proyecto            postgres    false    207            �
           1259    16509    fki_id_obra    INDEX     L   CREATE INDEX fki_id_obra ON proyecto.obra_expocision USING btree (id_obra);
 !   DROP INDEX proyecto.fki_id_obra;
       proyecto            postgres    false    207            �
           2606    16493    obra id_cliente    FK CONSTRAINT        ALTER TABLE ONLY proyecto.obra
    ADD CONSTRAINT id_cliente FOREIGN KEY (id_cliente) REFERENCES proyecto.cliente(id_cliente);
 ;   ALTER TABLE ONLY proyecto.obra DROP CONSTRAINT id_cliente;
       proyecto          postgres    false    206    205    2711            �
           2606    16499    obra id_estilo    FK CONSTRAINT     {   ALTER TABLE ONLY proyecto.obra
    ADD CONSTRAINT id_estilo FOREIGN KEY (id_estilo) REFERENCES proyecto.estilo(id_estilo);
 :   ALTER TABLE ONLY proyecto.obra DROP CONSTRAINT id_estilo;
       proyecto          postgres    false    206    204    2709            �
           2606    16510    obra_expocision id_expocision    FK CONSTRAINT     �   ALTER TABLE ONLY proyecto.obra_expocision
    ADD CONSTRAINT id_expocision FOREIGN KEY (id_exposicion) REFERENCES proyecto.exposicion(id_exposicion);
 I   ALTER TABLE ONLY proyecto.obra_expocision DROP CONSTRAINT id_expocision;
       proyecto          postgres    false    203    2707    207            �
           2606    16504    obra_expocision id_obra    FK CONSTRAINT     ~   ALTER TABLE ONLY proyecto.obra_expocision
    ADD CONSTRAINT id_obra FOREIGN KEY (id_obra) REFERENCES proyecto.obra(id_obra);
 C   ALTER TABLE ONLY proyecto.obra_expocision DROP CONSTRAINT id_obra;
       proyecto          postgres    false    2715    206    207            $      x������ � �      #      x������ � �      "      x������ � �      %      x������ � �      &      x������ � �     